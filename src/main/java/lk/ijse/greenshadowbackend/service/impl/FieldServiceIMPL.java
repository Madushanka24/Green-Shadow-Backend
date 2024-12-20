package lk.ijse.greenshadowbackend.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.greenshadowbackend.DataPersistException;
import lk.ijse.greenshadowbackend.customStatusCodes.SelectedFieldErrorStatus;
import lk.ijse.greenshadowbackend.dao.FieldDAO;
import lk.ijse.greenshadowbackend.dto.FieldStatus;
import lk.ijse.greenshadowbackend.dto.impl.FieldDTO;
import lk.ijse.greenshadowbackend.entity.impl.Field;
import lk.ijse.greenshadowbackend.exception.FieldNotFoundException;
import lk.ijse.greenshadowbackend.service.FieldService;
import lk.ijse.greenshadowbackend.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FieldServiceIMPL implements FieldService {
   @Autowired
   private FieldDAO fieldDao;
   @Autowired
   private Mapping fieldMapping;

    @Override
    public void saveField(FieldDTO fieldDTO) {
        Field savedField = fieldDao.save(fieldMapping.toFieldEntity(fieldDTO));
        if(savedField == null){
            throw new DataPersistException("Field not saved");
        }
    }

    @Override
    public List<FieldDTO> getAllFields() {
        return fieldMapping.asFieldDTOList( fieldDao.findAll());
    }

    @Override
    public FieldStatus getField(String fieldId) {
        if(fieldDao.existsById(fieldId)){
            var selectedField = fieldDao.getReferenceById(fieldId);
            return fieldMapping.toFieldDTO(selectedField);
        }else {
            return new SelectedFieldErrorStatus(404,"Selected field not found");
        }
    }

    @Override
    public void deleteField(String fieldId) {
        Optional<Field> foundField = fieldDao.findById(fieldId);
        if (!foundField.isPresent()) {
            throw new FieldNotFoundException("Field not found");
        }else {
            fieldDao.deleteById(fieldId);
        }
    }

    @Override
    public void updateField(String fieldId, FieldDTO fieldDTO) {

    }
}

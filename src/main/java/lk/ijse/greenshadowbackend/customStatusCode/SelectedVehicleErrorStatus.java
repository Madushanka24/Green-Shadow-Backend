package lk.ijse.greenshadowbackend.customStatusCode;

import lk.ijse.greenshadowbackend.dto.VehicleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedVehicleErrorStatus implements VehicleStatus {
    private int statusCode;
    private String statusMessage;
}

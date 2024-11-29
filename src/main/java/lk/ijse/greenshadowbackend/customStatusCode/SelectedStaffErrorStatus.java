package lk.ijse.greenshadowbackend.customStatusCode;

import lk.ijse.greenshadowbackend.dto.StaffStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedStaffErrorStatus implements StaffStatus {
    private int statusCode;
    private String statusMessage;
}

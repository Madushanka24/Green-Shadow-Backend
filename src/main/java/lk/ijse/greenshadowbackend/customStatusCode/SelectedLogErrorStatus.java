package lk.ijse.greenshadowbackend.customStatusCode;

import lk.ijse.greenshadowbackend.dto.LogStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedLogErrorStatus implements LogStatus {
    private int statusCode;
    private String statusMessage;
}

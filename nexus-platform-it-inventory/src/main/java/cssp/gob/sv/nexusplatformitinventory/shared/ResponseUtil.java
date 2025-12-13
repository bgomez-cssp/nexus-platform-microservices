package cssp.gob.sv.nexusplatformitinventory.shared;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {

    public static ResponseEntity<Map<String, Object>> buildSuccessResponse(HttpStatus status,Object data) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("data", data);
        return ResponseEntity.status(status).body(response);
    }

    public static ResponseEntity<Map<String, Object>> buildErrorResponse(
            HttpStatus status, boolean success, Object message) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", success);
        response.put("errors", message);
        return ResponseEntity.status(status).body(response);
    }

    public static ResponseEntity<Map<String, Object>> buildErrorResponse(
            HttpStatus status, boolean success) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", success);
        return ResponseEntity.status(status).body(response);
    }
}

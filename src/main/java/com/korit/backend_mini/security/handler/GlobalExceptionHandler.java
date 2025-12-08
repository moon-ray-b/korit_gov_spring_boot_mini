package com.korit.backend_mini.security.handler;

import com.korit.backend_mini.dto.ApiRespDto;
import org.springframework.http.ResponseEntity;

public class GlobalExceptionHandler {

    public ResponseEntity<?> handleRuntimeException(RuntimeException e) {
        return ResponseEntity.ok(new ApiRespDto<>("failed", " 문제가 발생 했습니다" + e.getMessage(),null));
    }
}

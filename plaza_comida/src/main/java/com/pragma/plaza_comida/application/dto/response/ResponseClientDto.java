package com.pragma.plaza_comida.application.dto.response;

import com.pragma.plaza_comida.application.dto.request.UserRequestDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseClientDto {
    private boolean error;
    private String message;
    private UserRequestDto data;

}

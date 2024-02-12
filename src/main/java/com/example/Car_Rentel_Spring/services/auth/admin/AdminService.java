package com.example.Car_Rentel_Spring.services.auth.admin;

import com.example.Car_Rentel_Spring.dto.CarDto;

import java.io.IOException;

public interface AdminService {
    boolean postCar(CarDto carDto) throws IOException;
}

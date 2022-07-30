package com.yy.royalmotors.util;

import com.yy.royalmotors.dto.CarDto;
import com.yy.royalmotors.dto.RoleDto;
import com.yy.royalmotors.dto.ServiceDto;
import com.yy.royalmotors.dto.UserDto;
import com.yy.royalmotors.model.Car;
import com.yy.royalmotors.model.Role;
import com.yy.royalmotors.model.Service;
import com.yy.royalmotors.model.User;

import java.util.stream.Collectors;

public class DtoConversion {

    public RoleDto convertRole(Role role){
        RoleDto roleDto = new RoleDto();

        roleDto.setId(role.getId());
        roleDto.setName(role.getName());

        return roleDto;
    }

    public UserDto convertUser(User user){
        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        if (user.getRole() != null){
            userDto.setRole(this.convertRole(user.getRole()));
        }

        return userDto;
    }

    public ServiceDto convertService(Service service){
        ServiceDto serviceDto = new ServiceDto();

        serviceDto.setId(service.getId());
        serviceDto.setName(service.getName());
        serviceDto.setDescription(service.getDescription());
        serviceDto.setServiceDate(service.getServiceDate());
        if (service.getCar() != null){
            serviceDto.setCarId(service.getCar().getId());
        }

        return serviceDto;
    }

    public CarDto convertCar(Car car){
        CarDto carDto = new CarDto();

        carDto.setId(car.getId());
        carDto.setModel(car.getModel());
        carDto.setPlate(car.getPlate());
        carDto.setProductionYear(car.getProductionYear());
        carDto.setRegisterDate(car.getRegisterDate());
        if (car.getServiceList() != null){
            carDto.setServiceList(car.getServiceList().stream()
                    .map(this::convertService).collect(Collectors.toList()));
        }

        return carDto;
    }


}

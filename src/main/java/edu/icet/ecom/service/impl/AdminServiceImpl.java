package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Admin;
import edu.icet.ecom.entity.AdminEntity;
import edu.icet.ecom.repository.AdminRepository;
import edu.icet.ecom.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    final AdminRepository repository;
    final ModelMapper mapper;

    @Override
    public void addAdmin(Admin admin) {

        //Password encryption
        String key = "@#$%&";
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword(key);
        String encryptedPassword = basicTextEncryptor.encrypt(admin.getPassword());
        admin.setPassword(encryptedPassword);

        repository.save(mapper.map(admin, AdminEntity.class));
    }
}

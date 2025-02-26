package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Admin;
import edu.icet.ecom.entity.AdminEntity;
import edu.icet.ecom.repository.AdminRepository;
import edu.icet.ecom.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void updateAdmin(Admin admin) {
        //Password encryption
        String key = "@#$%&";
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword(key);
        String encryptedPassword = basicTextEncryptor.encrypt(admin.getPassword());
        admin.setPassword(encryptedPassword);

        repository.save(mapper.map(admin, AdminEntity.class));
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> list = new ArrayList<>();
        List<AdminEntity> all = repository.findAll();

        all.forEach(adminEntity -> {

            //Password decryption
            String key = "@#$%&";
            BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
            basicTextEncryptor.setPassword(key);
            String decryptedPassword = basicTextEncryptor.decrypt(adminEntity.getPassword());
            adminEntity.setPassword(decryptedPassword);

            list.add(mapper.map(adminEntity,Admin.class));
        });
        return list;
    }
}

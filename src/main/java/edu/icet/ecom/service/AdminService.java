package edu.icet.ecom.service;

import edu.icet.ecom.dto.Admin;

import java.util.List;

public interface AdminService {
    void addAdmin(Admin admin);

    void updateAdmin(Admin admin);

    List<Admin> getAll();
}

package com.Springboot_Hibernate_PortgresSQL_Docker.Springboot_Hibernate_PortgresSQL_Docker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long>
{

}

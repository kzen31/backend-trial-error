package id.careerfund.api.runner;

import id.careerfund.api.domains.ERole;
import id.careerfund.api.domains.entities.Role;
import id.careerfund.api.domains.models.UserRegister;
import id.careerfund.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements ApplicationRunner {

    @Autowired
    UserService userService;

    @Override
    public void run(ApplicationArguments args) {
        userService.saveRoleIfNotExists(new Role(null, ERole.ROLE_ADMIN));
        userService.saveRoleIfNotExists(new Role(null, ERole.ROLE_USER));
        userService.saveRoleIfNotExists(new Role(null, ERole.ROLE_LENDER));
        userService.saveRoleIfNotExists(new Role(null, ERole.ROLE_BORROWER));

        userService.registerAdminIfNotExist(new UserRegister("Fahmi Al", "pass@gmail.com", "pass"));
        userService.registerLenderIfNotExists(new UserRegister("Invoker", "invoker@gmail.com", "pass"));
        userService.registerBorrowerIfNotExists(new UserRegister("Meepo", "meep@gmail.com", "pass"));
    }
}

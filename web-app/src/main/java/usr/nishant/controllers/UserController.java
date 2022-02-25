package usr.nishant.controllers;

import usr.nishant.domain.UserCommand;
import usr.nishant.entities.User;
import usr.nishant.mappers.UserMapper;

public class UserController {

    User saveUser(UserCommand userCommand) {

        //adhoc implementation
        return UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}

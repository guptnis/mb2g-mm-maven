package usr.nishant.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import usr.nishant.domain.UserCommand;
import usr.nishant.entities.User;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}

package app.wep.Repositories;


import app.wep.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Long> {


    User findUserByEmail (String email);
    boolean existsUserByEmail (String email);


    // Основные методы JpaRepository
    // save(entity) - сохраняет или обновляет запись
    // findById(id) - находит по id возвращает Optional
    // findAll() - Возвращает все записи
    // deleteById(id) - удаляет по id
    // delete(entity) - удаляет конкретный объект
    // count() - Возвращает кол-во записей
    // existById(id) - проверяет есть ли запись с таким Id
    // flush() - синхронизирует изменения с бд


}

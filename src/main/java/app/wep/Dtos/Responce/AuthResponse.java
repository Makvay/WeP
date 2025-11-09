package app.wep.Dtos.Responce;

import lombok.Data;

@Data
public class AuthResponse {
    private boolean success;
    private String message;
    private Long userId;
    private String userName;

    // Конструктор для успешного ответа
    public AuthResponse(boolean success, String message, Long userId, String userName) {
        this.success = success;
        this.message = message;
        this.userId = userId;
        this.userName = userName;
    }

    // Конструктор для ошибки
    public AuthResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Статические методы для удобства
    public static AuthResponse success(String message, Long userId, String userName) {
        return new AuthResponse(true, message, userId, userName);
    }

    public static AuthResponse error(String message) {
        return new AuthResponse(false, message);
    }
}
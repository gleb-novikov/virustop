package com.mc.virustop.web;

/** Интерфейс для реализация коллбэка, при работе с сервером. */
public interface WebCallback {
    /**
     * Метод, вызываемый при успешном запросе на сервер.
     * @param body данные с сервера
     */
    void onSuccess(String body);

    /**
     * Метод, вызываемый при неудачном запросе на сервер.
     * @param error ошибка запроса
     */
    void onFailing(String error);
}

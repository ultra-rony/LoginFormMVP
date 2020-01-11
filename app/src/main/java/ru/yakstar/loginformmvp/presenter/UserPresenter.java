package ru.yakstar.loginformmvp.presenter;

import ru.yakstar.loginformmvp.model.User;
import ru.yakstar.loginformmvp.view.MainActivityView;

public class UserPresenter implements  UserPresenterResult {

    private MainActivityView view;

    public UserPresenter(MainActivityView view){
        this.view = view;
    }

    @Override
    public void getUser(String mail, String password) {
        User user = new User(mail,password);
        int status = user.isValidData();

        if (status == 0)
            view.getMessage("Заполните поля");

        else if (status == 1)
            view.getMessage("Введите действительный email");

        else if (status == 2)
            view.getMessage("Пароль должен быть не менее 8 символов");

        else if (status == 3)
            view.getMessage("Успешно");
    }
}

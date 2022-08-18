package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {

    public static List<String> validate(Task t){
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(t);
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(t);
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    private static String validateTitle(Task t) {
        if(t.getTitle()==null || t.getTitle().equals("")) {
            return "タイトルが入力されていません。";
        }
        return "";
    }

    private static String validateContent(Task t) {
        if(t.getContent()==null || t.getContent().equals("")) {
            return "タスク内容が入力されていません。";
        }
        return "";
    }

}

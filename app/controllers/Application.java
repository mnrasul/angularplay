package controllers;

import java.io.File;
import java.io.IOException;
import play.mvc.*;

import org.apache.commons.io.FileUtils;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void phones(String phoneid) throws IOException {
        String utils = null;
        if (phoneid != null) {
            utils = FileUtils.readFileToString(new File("public/app/phones/" + phoneid));
        } else {
            utils = FileUtils.readFileToString(new File("public/app/index.html"));
        }

        renderHtml(utils);
    }
}
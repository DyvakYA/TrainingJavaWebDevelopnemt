package com.dyvak;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 17.03.2016.
 */
public class Model {

    // The Program logic
    public static void WriteUserInformation(String msg) {

        try (FileWriter printWriter = new FileWriter(Constants.FILE_NAME, true)) {
            doTask(printWriter, msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doTask(FileWriter writer, String msg) throws IOException {
        writer.write(msg + "\n");
        writer.close();
    }
}
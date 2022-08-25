package command.client;

import command.command.OpenTextFileOperation;
import command.command.SaveTextFileOperation;
import command.command.TextFileOperation;
import command.invoker.TextFileOperationExecutor;
import command.receiver.TextFile;

public class TextFileApplication {
    
    public static void main(String[] args) {

        // receiver 에는 해당 객체를 하는 역할이 다 포함되어 있다.

        // command 를 미리 만들어둔다.
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));

        
        //지금이다!
        // invoker 에 실행할 command 를 주입
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }   
}

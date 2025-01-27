/*
 * A quick program for the SaasQuatch competition.
 */
package saasquatch;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "saasquatch", mixinStandardHelpOptions = true, version = "saasquatch 1.0",
         description = "Prints the name of a neat company.")
public class CoolName implements Callable<Integer>  {
    @Override
    public Integer call() throws Exception {
        System.out.printf("SaaSquatch is cool :)");

        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new CoolName()).execute(args);
        System.exit(exitCode);
    }
}

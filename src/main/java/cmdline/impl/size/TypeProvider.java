package cmdline.impl.size;

import cmdline.api.CommandLine;
import cmdline.api.CommandLineProvider;

public class TypeProvider implements CommandLineProvider {
    @Override
    public CommandLine create() {
        return new CommandType();
    }
}
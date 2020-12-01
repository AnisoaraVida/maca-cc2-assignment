package filesystem.impl;

import cmdline.impl.common.CommandBase;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.ParametersDelegate;
import com.google.inject.Guice;
import com.google.inject.Injector;
import filesystem.api.Component;
import filesystem.api.Composite;
import filesystem.api.PathComponent;
import visitors.api.Visitor;
import visitors.impl.size.TypeVisitorBuilderModule;

import java.nio.file.Path;
import java.util.List;

public class ComponentType {
    @Parameters(commandNames = {"types"}, commandDescription = "Shows number of files and size. " +
            "Default behavior includes only files sizes in the total, while showing each directory's own size.")
    public class CommandType {
        private static final String NAME = "types";



    }




}

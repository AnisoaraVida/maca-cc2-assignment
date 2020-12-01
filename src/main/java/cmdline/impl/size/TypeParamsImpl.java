package cmdline.impl.size;

import cmdline.api.CommonParams;
import cmdline.api.TypeParams;
import cmdline.impl.common.CommonParamsImpl;
import cmdline.impl.common.SizeUnit;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParametersDelegate;
import filesystem.api.Component;
import filesystem.api.ComponentType;
import filesystem.api.Composite;
import filesystem.impl.ComponentImpl;
import filesystem.impl.File;
import visitors.api.Visitor;

import java.nio.file.Path;
import java.util.List;

public class TypeParamsImpl implements TypeParams {
    @ParametersDelegate
    private final CommonParams commonParams = new CommonParamsImpl();

    @Parameter(names = {"-fs", "--include-files"}, description = "include files sizes only in total, " +
            "showing each directory total as contained files or subdirectories' total." +
            " This implies that en empty directory's size is 0")
    protected boolean filesOnly = false;

    @Parameter(names = {"-ds", "--include-directories"}, description = "include directories sizes also in total, " +
            "showing each directory own's size")
    protected boolean includeDirectories = false;

    @Override
    public List<Path> getPaths() {
        return commonParams.getPaths();
    }

    @Override
    public SizeUnit getSizeUnit() {
        return commonParams.getSizeUnit();
    }

    @Override
    public boolean isHelp() {
        return commonParams.isHelp();
    }

    @Override
    public boolean isFilesOnly() {
        return filesOnly;
    }

    @Override
    public boolean isIncludeDirectories() {
        return includeDirectories;
    }
}
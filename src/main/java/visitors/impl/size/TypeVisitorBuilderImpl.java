package visitors.impl.size;

import cmdline.impl.common.SizeUnit;
import cmdline.impl.common.TypeUnit;
import filesystem.api.ComponentType;
import visitors.api.SizeVisitorBuilder;
import visitors.api.TypeVisitorBuilder;
import visitors.api.Visitor;
import visitors.api.VisitorBuilder;

public class TypeVisitorBuilderImpl implements TypeVisitorBuilder {

    private final TypeVisitor visitor;

    TypeVisitorBuilderImpl() {
        visitor = new TypeVisitor();
    }

    @Override
    public VisitorBuilder setSizeUnit(SizeUnit sizeUnit) {
        visitor.setSizeUnit(sizeUnit);
        return this;
    }

    @Override
    public VisitorBuilder setType(ComponentType type) {
        return null;
    }

    @Override
    public SizeVisitorBuilder setIncludeFilesOnly(boolean option) {
        visitor.setIncludeFilesOnly(option);
        return null;
    }

    @Override
    public SizeVisitorBuilder setIncludeDirectories(boolean option) {
        visitor.setIncludeDirectories(option);
        return null;
    }

    @Override
    public Visitor build() {
        return visitor;
    }
}


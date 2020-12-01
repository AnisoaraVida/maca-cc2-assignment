package visitors.api;

import cmdline.impl.common.SizeUnit;
import cmdline.impl.common.TypeUnit;
import filesystem.api.ComponentType;

/**
 * Basic visitor builder interface.
 */
public interface VisitorBuilder {
    VisitorBuilder setSizeUnit(SizeUnit sizeUnit);
    VisitorBuilder setType(ComponentType type);
    Visitor build();
}

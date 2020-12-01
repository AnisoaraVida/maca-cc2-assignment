package visitors.api;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public interface TypeVisitorBuilder extends VisitorBuilder {
    @Qualifier
    @Target({FIELD, PARAMETER, METHOD})
    @Retention(RUNTIME)
    @interface FileSize {}

    SizeVisitorBuilder setIncludeFilesOnly(boolean option);
    SizeVisitorBuilder setIncludeDirectories(boolean option);


}


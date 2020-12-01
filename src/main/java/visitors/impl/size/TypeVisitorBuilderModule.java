package visitors.impl.size;

import com.google.inject.AbstractModule;
import visitors.api.SizeVisitorBuilder;
import visitors.api.TypeVisitorBuilder;

public class TypeVisitorBuilderModule extends AbstractModule {

    public TypeVisitorBuilderModule() {
        super();
    }

    @Override
    protected void configure() {
        bind(SizeVisitorBuilder.class)
                .annotatedWith(SizeVisitorBuilder.FileSize.class)
                .to(SizeVisitorBuilderImpl.class);
    }

}

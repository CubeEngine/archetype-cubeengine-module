package ${package};

import de.cubeisland.engine.core.module.Module;

public class ${default-class} extends Module
{
    private ${default-class}Config config;
    
    @Override
    public void onEnable()
    {
        this.config = Configuration.load(${default-class}Config.class, this);
    }
}

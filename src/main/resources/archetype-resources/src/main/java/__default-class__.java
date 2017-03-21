package ${package};

import de.cubeisland.engine.modularity.asm.marker.ModuleInfo;
import de.cubeisland.engine.modularity.core.Module;
import de.cubeisland.engine.modularity.core.marker.Enable;
import org.cubeengine.libcube.service.filesystem.ModuleConfig;

@ModuleInfo(name = "${default-class}", description = "${description}")
public class ${default-class} extends Module
{
    @ModuleConfig private ${default-class}Config config;
    
    @Enable
    public void onEnable()
    {
        
    }
}

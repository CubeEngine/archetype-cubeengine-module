package ${package};

import org.cubeengine.processor.Module;
import org.cubeengine.libcube.CubeEngineModule;
import org.cubeengine.libcube.service.filesystem.ModuleConfig;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import javax.inject.Singleton;

@Singleton
@Module
public class ${default-class} extends CubeEngineModule
{
    @ModuleConfig private ${default-class}Config config;
    
    @Listener
    public void onPreInit(GamePreInitializationEvent event)
    {
        
    }
}

package ${package};

import java.nio.file.Path;
import javax.inject.Inject;
import de.cubeisland.engine.logscribe.Log;
import de.cubeisland.engine.modularity.asm.marker.ModuleInfo;
import de.cubeisland.engine.modularity.core.Module;
import de.cubeisland.engine.modularity.core.marker.Disable;
import de.cubeisland.engine.modularity.core.marker.Enable;
import org.cubeengine.reflect.Reflector;
import org.cubeengine.libcube.service.permission.Permission;
import org.cubeengine.module.shout.announce.Announcement;
import org.cubeengine.module.shout.announce.AnnouncementManager;
import org.cubeengine.module.shout.interactions.ShoutCommand;
import org.cubeengine.module.shout.interactions.ShoutListener;
import org.cubeengine.libcube.service.command.CommandManager;
import org.cubeengine.libcube.service.event.EventManager;
import org.cubeengine.libcube.service.i18n.I18n;
import org.cubeengine.libcube.service.matcher.StringMatcher;
import org.cubeengine.libcube.service.permission.PermissionManager;
import org.cubeengine.libcube.service.task.TaskManager;
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

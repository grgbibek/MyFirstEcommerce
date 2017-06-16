rStartLevel(ModuleContainer.java:1533)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.dispatchEvent(ModuleContainer.java:1476)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.dispatchEvent(ModuleContainer.java:1)
	at org.eclipse.osgi.framework.eventmgr.EventManager.dispatchEvent(EventManager.java:230)
	at org.eclipse.osgi.framework.eventmgr.EventManager$EventThread.run(EventManager.java:340)

!ENTRY org.eclipse.core.resources 2 10035 2017-06-16 09:39:30.163
!MESSAGE The workspace exited with unsaved changes in the previous session; refreshing workspace to recover changes.

!ENTRY org.eclipse.core.resources 4 567 2017-06-16 09:39:31.788
!MESSAGE Workspace restored, but some problems occurred.
!SUBENTRY 1 org.eclipse.core.resources 4 567 2017-06-16 09:39:31.788
!MESSAGE Could not read metadata for 'EcommerceWeb'.
!STACK 1
org.eclipse.core.internal.resources.ResourceException: The project description file (.project) for 'EcommerceWeb' is missing.  This file contains important information about the project.  The project will not function properly until this file is restored.
	at org.eclipse.core.internal.localstore.FileSystemResourceManager.read(FileSystemResourceManager.java:888)
	at org.eclipse.core.internal.resources.SaveManager.restoreMetaInfo(SaveManager.java:902)
	at org.eclipse.core.internal.resources.SaveManager.restoreMetaInfo(SaveManager.java:882)
	at org.eclipse.core.internal.resources.SaveManager.restore(SaveManager.java:733)
	at org.eclipse.core.internal.resources.SaveManager.startup(SaveManager.java:1588)
	at org.eclipse.core.internal.resources.Workspace.startup(Workspace.java:2386)
	at org.eclipse.core.internal.resources.Workspace.open(Workspace.java:2157)
	at org.eclipse.core.resources.ResourcesPlugin.start(ResourcesPlugin.java:463)
	at org.eclipse.osgi.internal.framework.BundleContextImpl$3.run(BundleContextImpl.java:771)
	at org.eclipse.osgi.internal.f
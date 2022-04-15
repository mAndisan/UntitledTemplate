package com.github.mandisan.untitledtemplate.services

import com.intellij.openapi.project.Project
import com.github.mandisan.untitledtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

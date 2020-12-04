package com.github.godmeowicesun.javaicesunideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.godmeowicesun.javaicesunideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

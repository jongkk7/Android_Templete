package com.github.jongkk7.androidtemplete.services

import com.github.jongkk7.androidtemplete.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

plugins {
    id("java")
}

group = "dev.itsu.bjvm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")
}

tasks.compileJava {
    // 文字列結合に invokeDynamic を使用しないようにする（Java8 までのインライン結合を利用）
    options.compilerArgs = arrayListOf("-XDstringConcat=inline")
}

tasks.jar {
    archiveFileName.set("bjvm-webapi-bindings.jar")
}
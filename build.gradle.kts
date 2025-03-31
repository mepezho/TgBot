plugins {
    id("java")
    id("org.hibernate.orm") version "7.0.0.Beta2" //hibernate connection
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.1.4") //postgersql jdbc driver
    implementation("io.github.natanimn:telebof:0.2.1") //telebof
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
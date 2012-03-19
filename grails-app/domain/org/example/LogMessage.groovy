package org.example

class LogMessage {
    String appName
    String message
    String category
    String level

    static constraints = {
        category nullable: true
        level nullable: true
    }
}

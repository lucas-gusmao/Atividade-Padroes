package br.edu.ifpb.padroes.service.log;

public class LogHandler {

    public LogHandler(LogHandlerType type) {
        this.type = type;
    }

    private LogHandlerType type;

    public void log(String message) {
        this.type.log();
    }

}

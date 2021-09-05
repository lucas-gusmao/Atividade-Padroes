package br.edu.ifpb.padroes.service.log;

public enum LogStateEnum implements LogHandlerType{
    DATABASE{
        public LogHandlerType log(){
            System.out.println("save data to database");
            return null;
        }
    },
    FILE{
        public LogHandlerType log(){
            System.out.println("save data to file");
            return null;
        }
    }
}


def funcion
    begin
        raise "Mal"
    rescue Exception => msg
        puts msg.message
    ensure
    end
    
    puts "esto esta fuera de la excepcion"
end


funcion
function main()
    repeat
        io.write('Ingresa un valor: ')
        local value, control = io.read('*n'), true

        if value >= 10 then
            print('Muy bien')
            control = false
        elseif value < 10 then
            print('Por debajo')
            control = true
        else
            print('Bla bla')
        end
    until control
end

main()

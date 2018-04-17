array = []

cont = 0
while cont < 3
    print "Dame numero "
    n = gets.chomp
    
    array[cont] = n
    cont += 1
end

print "#{array}\n"
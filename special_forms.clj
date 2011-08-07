;;(def symbol init?)
(def value 1)

;;(do exprs*)
(do (print "hello") (println " world"))

;;(if test then else?)
(if value
  (prn value)
  (prn "value is not exists"))

;;(quote form)
(prn '(just for test))

;;(fn name? ([params* ] exprs*)+)
(prn ((fn [v] (* v v)) 4))

;;(let [bindings* ] exprs*)
(let [value 2]
  (println "value in let:" value))

;;loop and recur
(def factorial
	 (fn [n]
	   ;;establishes a recursion point at the top of the loop
	   (loop [cnt n acc 1]
		 (if (zero? cnt)
		   acc
		   ;;rebinds the bindings of the recursion point to the values of the exprs,jumps back to the recursion point
		   (recur (dec cnt) (* acc cnt))))))


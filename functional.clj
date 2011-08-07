(defn square
  "hello world"
  [^Integer x]
  (* x x))
(prn (square 3))
(prn (doc square))
(prn (count (filter 
			 zero?
			 [0,2,3,0,0,4])))
(prn (pmap not [true false]))


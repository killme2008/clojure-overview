;;定义自然数集合
(def integers (iterate inc 0))

(println (take 9 integers))

;;偶数集合和奇数集合
(def evens (filter even? integers))
(def odds (filter odd? integers))

(println (take 9 evens))
(println (take 9 odds))

;;斐波那契数列
(def fib-seq 
	 ((fn rfib [a b] 
		(lazy-seq (cons a (rfib b (+ a b)))))
	  0 1))
(println (take 20 fib-seq))
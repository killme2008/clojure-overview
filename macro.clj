(defmacro unless
  [test body]
  `(if ~test
	 nil
	 ~body))

(unless (> 0 1) (println "hello world"))
;;(if (> 0 1) nil (println hello world))
(println (macroexpand-1 '(unless (> 0 1) (println "hello world"))))


  

  
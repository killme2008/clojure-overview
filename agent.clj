;;define agents
(def counter (agent 0))

;;deference
(println @counter)

;;send and send-off,await

(send counter inc)
(send-off counter + 10)
(await counter)
(println @counter)

;;in transacton
(def backup-agent (agent "output/messages-backup.clj" ))
(def messages (ref []))

(defn add-message-with-backup [msg]
       (dosync
		(let [snapshot (commute messages conj msg)]
                (send-off backup-agent (fn [filename]
                                        (spit filename snapshot)
                                        filename))
				snapshot)))
(add-message-with-backup "one")
(add-message-with-backup "two")
(add-message-with-backup "three")
(await backup-agent)
;;shutdown
(shutdown-agents)

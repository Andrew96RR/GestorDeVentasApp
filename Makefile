clone:
	git clone https://github.com/Andrew96RR/GestorDeVentasApp.git

gitAA:
	git add .

gitLogin:
	git config --global user.email "andresmrojasm@hotmail.com"
	git config --global user.name "Andrew96RR"

gitCommit:
	git commit -m "myNewCommit"

gitRef:
	git reflog

gorigin:
	git remote add origin https://github.com/Andrew96RR/GestorDeVentasApp.git

pushtoMain:
	git branch -M main
	git push -u origin main

pushtoBr:
	git checkout -b my-feature-branch
	git push -u origin my-feature-branch

createRepo:
	gh repo create Andrew96RR/FerSales_Bussiness_app_front --private --source=. --remote=origin --push

checkRemote:
	git remote -v

repoExist:
	git init
	git remote add origin https://github.com/Andrew96RR/GestorDeVentasApp.git
	git pull
	git checkout main -f
	git branch --set-upstream-to origin/main

pull:
	git remote add origin https://github.com/Andrew96RR/GestorDeVentasApp.git
	git pull
	git checkout main -f
	git branch --set-upstream-to origin/main
		
.PHONY: clone gitAA gitLogin gitCommit gitRef gorigin pushtoMain pushtoBr createRepo repoExist

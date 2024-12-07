Feature: Je verfie la page d authentification
  En tant que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario:  Je verfie la page d authentification
  Given Je me connecte sur l application Mercury 
	When Je saisi le username "test"
	And Je saisi le password "test"
	And je clique sur le button Submit
 	Then Je me redirige vers la pagr home "Login Successfully"
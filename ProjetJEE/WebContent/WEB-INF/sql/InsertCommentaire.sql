USE [RESTAURANT]
GO

INSERT INTO [dbo].[commentaire]
           ([id_plat]
           ,[id_utilisateur]
           ,[note]
           ,[commentaire]
           ,[date])
     VALUES
           (9,1,3,'C''est très bon !!!',getdate())
GO


